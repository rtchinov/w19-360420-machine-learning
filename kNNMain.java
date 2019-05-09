import java.util.List;
	import java.io.FileNotFoundException;
	import java.util.Arrays;



public class kNNMain{

  private static String List;

public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
	
   //the path is given by the file inputed(args0)=assigned to pathOfData variable 
	String pathOfData = args[0];
	//use pathToData as a parameter in the readDataSet()
	List<DataPoint> DataNew = DataSet.readDataSet(pathOfData); 
	//printing args0=pathOfData
	System.out.println(pathOfData);
	//Choose one data point 
	DataPoint dataPoint = DataNew.get(3);
	//Print the label of this dataPoint using getLabel() method
	System.out.println(dataPoint.getLabel());
	//change the array to a string to allow the data to be printed
	String printableX = Arrays.toString(dataPoint.getX());
	//printing the features
	System.out.println(printableX);
	
	
	//java kNNMain data/iris.csv  //or the file u want to go into
    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset


    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
