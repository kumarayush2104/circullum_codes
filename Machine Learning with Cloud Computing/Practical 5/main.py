from pandas import read_csv, DataFrame, concat
from scipy.stats import linregress
from dotenv import load_dotenv
from os.path import exists
from os import getenv
from numpy import array_split

def validate_env(dataset: str, x_var: str, y_var: str):
    if not exists(dataset):
        raise FileNotFoundError(f"Dataset '{dataset}' does not exist")
    if x_var == None or y_var == None:
        raise Exception("Please define independent and dependent variable")

def main():
    if not exists(".env"):
        raise FileNotFoundError("Please create a env file with DATASET, FOLD, INDEPENDENT_VAR and DEPENDENT_VAR")
    
    load_dotenv()

    try:
        dataset = getenv("DATASET")
        x = getenv("INDEPENDENT_VAR")
        y = getenv("DEPENDENT_VAR")
        foldings = int(getenv("FOLD"))

        validate_env(dataset, x, y)
        
        dataframe = read_csv(dataset)

        if not dataframe.columns.__contains__(x) or not dataframe.columns.__contains__(y):
            raise Exception("Independent or Dependent variable does not exist in the dataset")

        dataframe = dataframe.sample(frac=1)
        stacks = array_split(dataframe, foldings)

        avg_error = 0
        avg_r_square = 0
        
        for i in range(0, foldings):
            testing_set = stacks[i]
            training_set = concat([stacks[j] for j in range(foldings) if j != i])
            regression_statistics = linregress(training_set[x], training_set[y])
            avg_error += ((regression_statistics.slope * testing_set[x] + regression_statistics.intercept).mean()) - testing_set[y].mean()
            avg_r_square += regression_statistics.rvalue
            
        print("*************************** K-Fold Statistics ***************************")
        print(f"Total Observations: {dataframe.shape[0]}")
        print(f"Number of Folding: {foldings}")
        print(f"Training Observations (Single Fold): {int((dataframe.shape[0] * 4) / 5)}")
        print(f"Testing Observations (Single Fold): {int(dataframe.shape[0] / foldings)}")
        print(f"Average Error: {avg_error / foldings}")
        print(f"Average R Squared: {avg_r_square / foldings}")
        print("*************************************************************************")
        
    except Exception as e:
        print(e)

main()
   