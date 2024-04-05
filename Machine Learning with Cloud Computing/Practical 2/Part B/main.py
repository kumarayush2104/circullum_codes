import matplotlib.pyplot as plot
from dotenv import load_dotenv
from os import getenv
from os import path
import pandas

def bar_graph(dataset: pandas.DataFrame, x_data: str, y_data: str):
    plot.xlabel(x_data)
    plot.ylabel(y_data)
    plot.bar(dataset[x_data], dataset[y_data])
    plot.show()

def histrogram(dataset: pandas.DataFrame, data: str):
    plot.xlabel(data)
    plot.ylabel("Frequency")
    plot.hist(dataset[data], edgecolor = "white")
    plot.show()

def line_chart(dataset: pandas.DataFrame, x_data: str, y_data: str):
    plot.xlabel(x_data)
    plot.ylabel(y_data)
    plot.plot(dataset[x_data], dataset[y_data])
    plot.show()

def pie_chart(dataset: pandas.DataFrame, x_data: str, y_data: str):
    plot.pie(dataset[y_data], labels = dataset[x_data])
    plot.show()

def scatter_chart(dataset: pandas.DataFrame, x_data: str, y_data: str):
    plot.xlabel(x_data)
    plot.ylabel(y_data)
    plot.scatter(dataset[x_data], dataset[y_data])
    plot.show()

def validate_env(dataset: str, x_var: str, y_var: str):
    if not path.exists(dataset):
        raise FileNotFoundError(f"Dataset '{dataset}' does not exist")
    if x_var == None or y_var == None:
        raise Exception("Please define independent and dependent variable")

def main():
    try:
        load_dotenv()
        dataset = getenv("DATASET")
        x_var = getenv("X_VAR")
        y_var = getenv("Y_VAR")
        graph_type = getenv("GRAPH_TYPE")

        validate_env(dataset, x_var, y_var)

        dataframe = pandas.read_csv(dataset)

        match graph_type:
            case "BAR":
                bar_graph(dataframe, x_var, y_var)
            case "SCATTER":
                scatter_chart(dataframe, x_var, y_var)
            case "PIE":
                pie_chart(dataframe, x_var, y_var)
            case "LINE":
                line_chart(dataframe, x_var, y_var)
            case "HISTOGRAM":
                histrogram(dataframe, x_var)
            case _:
                pass

    except Exception as e:
        print(e)

main()