# Report :

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The data analysis of the breast Cancer data set is complex. There are many parameters involved and the stakes are high if an error is made. The categorization of the growths can either be classified as benign or malignant. If a misdiagnosis occurs, severe consequences ensue. Therefore, optimal accuracy of our model is crucial.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First, the machine must be able to find a pattern that will posit a correct prediction of the type of tumor. 

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To increase our confidence in the model, we followed the process of choosing the testing and the training set and applying the k nearest neighbor algorithm 1000 times.
Inside this algorithm, the machine looked at the distance between the target data point parameter and the values of the parameters surrounding it. Afterwards, the program classifies the nearest neighbors and determines the identity of the target data point, that is defined as the predominant identity of the other points within the maximum distance determined by the kNNClassifier class.

 Every time that the process is repeated, the accuracy changes. With each run, a new training and testing set is selected, therefore, the ability of the machine to categorize the tumor may vary according to the data set that is selected at random. This is dependent on the proximity of the data points and on the distribution of the data provided by the breastCancer.csv dataset.After the completion of the 1000 runs, the model must be able to provide its average accuracy to the user. To accomplish this, the average accuracy was evaluated by the provided mean and standard deviation methods.In addition, to evaluate if our model is adequate, a comparison to another basic model must be made, to prove that our model is in fact sufficiently superior to be considered effective in categorizing tumors. 
To determine the chance of picking either malignant or benign without looking at the data, the frequency of each in the complete dat set must be evaluated. Once the printLabelFrequencies method is called, the terminal outputs the following: 

benign 444 dataPoints
 malignant 237 dataPoints

Therefore, out of the 444+237=681 datapoints, 65.198\% are benign and 34.802\% are malignant.Thus, even without a proper model, the probability is higher to pick benign over malignant whilst categorizing. 

Although our model/classifier offers a pretty good prediction of ........, the model still makes erroneous predictions.These errors are evaluated in terms of Accuracy level in our model. However, in actuality, medical diagnosis often involves various other sources of error. First, the notions of false positives and false negatives are crucial. A false positive is defined as the AI saying that someone has a cancer while they don't.
 A false negative is defined as the Ai saying that someone doesn't have a tumor while they do.
Now, in addition to accuracy, it is important to identify Recall and Precision for each iteration of the algorithm during the 1000 runs. 
Recall  is (as far as I know it is the number of value given over the number of value that should have been given)
Precision is the number of relevant values given in a total number of values.
For these two concepts, as recall level increases, precision must decrease. Therefore, it important to find such values of recall that maximize the average accuracy over the 1000 runs and the minimizes the error and the occurrence of false positives and false negatives. 
\\The difference between the two is .......


###What does sensible baseline mean?


In the k nearest neighbors algorithm the accuracy and the level of error depends as the k-parameter changes as well. For







