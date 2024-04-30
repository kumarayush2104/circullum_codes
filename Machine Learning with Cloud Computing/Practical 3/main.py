from dotenv import load_dotenv
from os import getenv
from os.path import exists
from pandas import read_csv

def main():
    if not exists(".env"):
        print("Please create a env file with DATASET, FRAC")
        return
    
    load_dotenv()

    try:
        # fetch enviornment variables
        dataset = getenv("DATASET")
        fraction = getenv("FRAC")
        
        # read the dataset and shuffle it
        dataframe = read_csv(dataset)
        dataframe = dataframe.sample(frac=1)
        total_observations = dataframe.shape[0]

        # split the dataset into training and testing dataset
        train_dataset = dataframe[:int(total_observations * float(fraction))]
        test_dataset = dataframe[int(total_observations * float(fraction)):]

        print("             Training Dataset             ")
        print(train_dataset)
        print("******************************************", end="\n\n")

        print("              Testing Dataset             ")
        print(test_dataset)
        print("******************************************")
    except Exception as e:
        print(e)

main()