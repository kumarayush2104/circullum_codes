from pandas import read_csv
from scipy.stats import linregress
from dotenv import load_dotenv
from os.path import exists
from os import getenv

def validate_env(dataset: str, x_var: str, y_var: str):
    if not exists(dataset):
        raise FileNotFoundError(f"Dataset '{dataset}' does not exist")
    if x_var == None or y_var == None:
        raise Exception("Please define independent and dependent variable")

def main():
    if not exists(".env"):
        raise FileNotFoundError("Please create a env file with DATASET, INDEPENDENT_VAR and DEPENDENT_VAR")
    
    load_dotenv()

    try:
        dataset = getenv("DATASET")
        x = getenv("INDEPENDENT_VAR")
        y = getenv("DEPENDENT_VAR")

        validate_env(dataset, x, y)
        
        dataframe = read_csv(dataset)

        if not dataframe.columns.__contains__(x) or not dataframe.columns.__contains__(y):
            raise Exception("Independent or Dependent variable does not exist in the dataset")
        
        regression_statistics = linregress(dataframe[x], dataframe[y])
        print(dataframe)
        print("*************************** Regression Statistics ***************************")
        print(f"Total Observations: {dataframe.shape[0]}")
        print(f"Slope: {regression_statistics.slope}")
        print(f"Intercept: {regression_statistics.intercept}")
        print(f"Standard Error: {regression_statistics.stderr}")
        print(f"R Squared: {regression_statistics.rvalue}")
        print("*****************************************************************************")
        
    except Exception as e:
        print(e)

main()
   