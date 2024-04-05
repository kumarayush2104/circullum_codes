from dotenv import load_dotenv
from math import sqrt
from os import getenv
from os import path
import pandas

def get_determinant_coefficient(covariance: float, x_std: float, y_std: float) -> float:
    return (covariance / (x_std * y_std)) ** 2

def get_linear_regression(covariance: float, x_variance: float, x_mean: float, y_mean: float) -> (float):
    slope = covariance / x_variance
    intercept = y_mean - slope * x_mean
    return (slope, intercept)

def validate_env(dataset: str, x_var: str, y_var: str):
    if not path.exists(dataset):
        raise FileNotFoundError(f"Dataset '{dataset}' does not exist")
    if x_var == None or y_var == None:
        raise Exception("Please define independent and dependent variable")

def main():
    if not path.exists(".env"):
        raise FileNotFoundError("Please create a env file with DATASET, INDEPENDENT_VAR and DEPENDENT_VAR")
    
    load_dotenv()

    try:
        dataset = getenv("DATASET")
        x = getenv("INDEPENDENT_VAR")
        y = getenv("DEPENDENT_VAR")

        validate_env(dataset, x, y)
        
        dataframe = pandas.read_csv(dataset)

        if not dataframe.columns.__contains__(x) or not dataframe.columns.__contains__(y):
            raise Exception("Independent or Dependent variable does not exist in the dataset")
        
        x_mean = dataframe[x].mean()
        y_mean = dataframe[y].mean()

        x_deviation = dataframe[x] - x_mean
        y_deviation = dataframe[y] - y_mean
        
        covariance = (x_deviation * y_deviation).mean()
        x_variance = (x_deviation ** 2).mean()
        y_variance = (y_deviation ** 2).mean()

        x_std_variance = sqrt(x_variance)
        y_std_variance = sqrt(y_variance)

        (slope, intercept) = get_linear_regression(covariance, x_variance, x_mean, y_mean)
        r_square = get_determinant_coefficient(covariance, x_std_variance, y_std_variance)

        print("*************************** Regression Statistics ***************************")
        print(f"Total Observations: {dataframe.shape[0]}")
        print(f"Slope: {slope}")
        print(f"Intercept: {intercept}")
        print(f"Standard Error: {((slope * dataframe[x] + intercept) - dataframe[y]).mean()}")
        print(f"R Squared: {r_square}")
        print("*****************************************************************************")

        model_out = getenv("MODEL_OUT")
        if  model_out != None:
            model = open(model_out, "w")
            model.writelines(["import sys\n", f"print({slope} * int(sys.argv[1]) + {intercept})"])
            model.close()
            print("[i] Use python model.py {value} to predict the value")

    except Exception as e:
        print(e)

main()