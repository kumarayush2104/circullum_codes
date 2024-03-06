from dotenv import load_dotenv
from sqlalchemy import create_engine, engine
from os import getenv
from os.path import exists
import pandas

def create_connection(username: str, password: str, database_name: str) -> engine.Engine:
    return create_engine("mysql+pymysql://{username}:{password}@localhost:3306/{database_name}".format(username=username, password=password, database_name=database_name))

def main():
    if not exists(".env"):
        print("Please create a env file with MYSQL_USERNAME, MYSQL_PASSWORD and DATABASE_NAME")
        return
    
    load_dotenv()

    try:
        connection = create_connection(getenv("MYSQL_USERNAME"), getenv("MYSQL_PASSWORD") ,getenv("DATABASE_NAME"))
        dataframe = pandas.read_sql("SELECT * FROM RainfallData", con=connection)
        print(dataframe)
    except Exception as e:
        print(e)

main()