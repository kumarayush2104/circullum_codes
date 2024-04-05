from math import sqrt
from os import getenv
from os.path import exists
from pandas import read_csv
from dotenv import load_dotenv

def validate_env(dataset: str, target: str):
    if not exists(dataset):
        raise FileNotFoundError(f"Dataset '{dataset}' does not exist")
    if target == None:
        raise Exception("Please define independent and dependent variable")

def main():
    if not exists(".env"):
        raise FileNotFoundError("Please create a env file with DATASET and TARGET")
    load_dotenv()
    try:
        dataset = getenv("DATASET")
        target = getenv("TARGET")
        validate_env(dataset, target)
        
        dataframe = read_csv(dataset)

        if not dataframe.columns.__contains__(target):
            raise Exception("Target variable do not exist in the dataset")
        
        target_mean = dataframe[target].mean()
        target_deviation = dataframe[target] - target_mean
        target_std_deviation = sqrt((target_deviation ** 2).mean())

        print(f"Column {target}'s mean: {dataframe[target].mean()}")
        print(f"Column {target}'s median: {dataframe[target].median()}")
        print(f"Column {target}'s mode:\n{dataframe[target].mode()}")
        print(f"Column {target}'s Standard Deviation: {target_std_deviation}")

    except Exception as e:
        print(e)

main()