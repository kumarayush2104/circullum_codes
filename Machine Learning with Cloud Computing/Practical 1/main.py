from dotenv import load_dotenv
from os import getenv
from os.path import exists
import pandas

def main():
    if not exists(".env"):
        print("Please create a env file with DATASET, INT_COLUMN_CHECK and STRING_COLUMN_CHECK")
        return
    
    load_dotenv()

    csv_file = getenv("DATASET")

    if not exists(csv_file):
        print("CSV file doesn't exist")
        return
    
    data_set = pandas.read_csv(csv_file)
    print("==========Original Dataset===========")
    print(data_set)
    print("=====================================")

    int_columns_check = getenv("INT_COLUMN_CHECK").split(",")
    string_columns_check = getenv("STRING_COLUMN_CHECK").split(",")

    for column in int_columns_check:
        if data_set[column].hasnans:
            data_set[column].fillna(data_set[column].median(), inplace = True)
    
    for column in string_columns_check:
        if data_set[column].hasnans:
            data_set.dropna(subset=[column], inplace = True)
    
    print("==========Cleaned Dataset===========")
    print(data_set)
    print("====================================")
    
main()