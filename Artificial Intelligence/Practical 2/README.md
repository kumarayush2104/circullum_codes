#How to use

1. Ensure Python is Installed: Verify that Python is installed on your system. This is a prerequisite for running the script and managing the dependencies.
2. Install Required Dependencies: Use the Python package manager, pip, to install all necessary dependencies listed in the `requirements.txt` file. Execute the following command in your terminal or command prompt:
   `pip install -r requirements.txt`. 
3. Create an Environment Configuration File: Before running the program, you need to create a `.env` file in the same directory as your script. This file should contain configurations for the dataset, including paths and variable names. Specifically, define the following configurations:
   -DATASET: The file path to your dataset.
   -INDEPENDENT_VAR: The column name in your dataset that serves as the independent variable.
   -DEPENDENT_VAR: The column name in your dataset that serves as the dependent variable.
   -MODEL_OUT (Optional): The file path where the trained model will be saved, enabling future predictions.

4. **Execute the Program:** Once the setup is complete, you can run the program by executing it from the command line or terminal. Navigate to the directory containing your script and use the following command:
   `python main.py`
