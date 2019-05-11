import java.util.List;
	import java.io.FileNotFoundException;
	import java.util.Arrays;



public class kNNMain{



public static void main(String... args) throws FileNotFoundException{
	//setting the fraction of training and testing 
	double fractionTrainingSet=0.8; 
	double fractionTestSet=1.0-fractionTrainingSet; 
    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
	
   //the path is given by the file inputed(args0)=assigned to pathOfData variable 
	String pathToData = args[0];
	//use pathToData as a parameter in the readDataSet()
	List<DataPoint> Data = DataSet.readDataSet(pathToData); 
	//printing args0=pathOfData
	System.out.println(pathToData);
	//Choose one data point 
	DataPoint dataPoint = Data.get(23);
	//Print the label of this dataPoint using getLabel() method
	System.out.println(dataPoint.getLabel());
	//change the array to a string to allow the data to be printed
	String printString = Arrays.toString(dataPoint.getX());
	//printing the features
	System.out.println(printString);
	
	/**To use in CMD */ 
	//java kNNMain data/iris.csv  
	
	
	// TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.
	
		
	
			
		    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
			List<DataPoint> trainingDataSet=DataSet.getTrainingSet(Data,fractionTrainingSet); 
			List<DataPoint> testingDataSet=DataSet.getTestSet(Data,fractionTestSet); 
			
		    
			
		
		
		    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
		    // and returns the Euclidean distance between those two points (as a double)
			for (int k=0; k<Data.size(); k++)
			{
			System.out.println("Distance to point is " + DataSet.distanceEuclid(Data.get(k), dataPoint ));
			}
		    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
		    // and make a print a predicted target label
				
		
		    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
		    // point based on nearest neighbors in training set. Calculate accuracy of model.
			
  }

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
