\documentclass{article}
\usepackage[utf8]{inputenc}
\usepackage[margin= 1.5in]{geometry}
\usepackage{amsmath}
\usepackage{graphicx}
\title{Machine Learning Report}
\author{Andrew Salem and Rachel Tchinov\\ \\ Intro to Programming in Engineering and Science \\ 360-420-DW section 01}
\date{14 May 2019}

\begin{document}

\maketitle

\section{Instructions for report}
Report: Error Analysis

Now that you understand how to interact with the classes in this project, your final task is to analyse the performance of kNN classification on the `breastCancer.csv` dataset.

Most importantly, we want to characterize

 - the amount of confidence we can put in our model
    - Each time you run the classification model, you should be getting a different accuracy. Why? (hint: lines 148-150 in `DataSet.java`)
    - Run the entire classification process 1000 times (load data, split into off 30\% for a test set, evaluate model performance)
    - store the results of each run in a `double[]`; use the `mean` and `standardDeviation` methods in `kNNMain.java` to calculate how much performance can be expected to vary on unseen data
        - What is a sensible baseline against which we should compare our model's performance? (hint: line 200 in `DataSet.java`)

 - the types of errors that our classifier makes
    - *Accuracy* is only one way that we can evaluate model performance. However in the context of medical diagnosis, different types of classification errors carry importances.
    - what is a
      - False Positive?
      - False Negative?

    - Extend your analysis in the previous step (with the 1000 runs) to keep track of **Recall** and **Precision** as well.
      - What makes these two measures different?
      - What are sensible baseline for each of these measures?

    - how do the above results change with the **hyperparameter** *k*?

 - Describe your results, and answer the questions above in a short report written using [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) in the files `ErrorAnalysis.md` template file in this repo. Submit in teams of 2 max (make sure to include both names).
\par Start of report
\\ \\ \par The data analysis of the breast Cancer data set is complex. There are many parameters involved and the stakes are high if an error is made. The categorization of the growths can either be classified as benign or malignant. If a misdiagnosis occurs, severe consequences ensue. Therefore, optimal accuracy of our model is crucial.
First, the machine must be able to find a pattern that will posit a correct prediction of the type of tumor.
\\ \par To increase our confidence in the model, we followed the process of choosing the testing and the training set and applying the k nearest neighbor algorithm 1000 times.
Inside this algorithm, the machine looked at the distance between the target data point parameter and the values of the parameters surrounding it. Afterwards, the program classifies the nearest neighbors and determines the identity of the target data point, that is defined as the predominant identity of the other points within the maximum distance determined by the kNNClassifier class.  
\\ \par Every time that the process is repeated, the accuracy changes. With each run, a new training and testing set is selected, therefore, the ability of the machine to categorize the tumor may vary according to the data set that is selected at random. This is dependent on the proximity of the data points and on the distribution of the data provided by the breastCancer.csv dataset.After the completion of the 1000 runs, the model must be able to provide its average accuracy to the user. To accomplish this, the average accuracy was evaluated by the provided mean and standard deviation methods.In addition, to evaluate if our model is adequate, a comparison to another basic model must be made, to prove that our model is in fact sufficiently superior to be considered effective in categorizing tumors.
To determine the chance of picking either malignant or benign without looking at the data, the frequency of each in the complete dat set must be evaluated. Once the printLabelFrequencies method is called, the terminal outputs the following:
\\ \\
benign 444 dataPoints
\\ malignant 237 dataPoints
\\ \\
Therefore, out of the 444+237=681 datapoints, 65.198\% are benign and 34.802\% are malignant.Thus, even without a proper model, the probability is higher to pick benign over malignant whilst categorizing. 

\\Although our model/classifier offers a pretty good prediction of ........, the model still makes erroneous predictions.These errors are evaluated in terms of Accuracy level in our model. However, in actuality, medical diagnosis often involves various other sources of error. First, the notions of false positives and false negatives are crucial. A false positive is defined as.....
\\ A false negative is defined as......
\\Now, in addition to accuracy, it is important to identify Recall and Precision for each iteration of the algorithm during the 1000 runs.
\\Recall is .......
\\Precision is.......
\\For these two concepts, as recall level increases, precision must decrease. Therefore, it important to find such values of recall that maximize the average accuracy over the 1000 runs and the minimizes the error and the occurrence of false positives and false negatives.
\\The difference between the two is .......


###What does sensible baseline mean?


\\ In the k nearest neighbors algorithm the accuracy and the level of error depends on the k-parameter. As k-parameter increases the radius of distance $$d=sqrt((x_1)^2 +.......+(x_n)^2)$$, increases, since more points are included to be neighbors. Although, this makes a prediction based on more points, it also increases the frequency of false positives and negatives. This is due to the fact that the more the radius of search for Nearest Neighbors increases, the more likely it is to enter a boundary of a certain parameter and to end up using stray datapoints that may be erroneous, abnormal and very far from the predicted trend. Therefore, it is important to find the balance to minimize false positives and false negatives while still maintaining an adequate number of neighbors that maximize the precision and the accuracy of this model.


\end{document}
