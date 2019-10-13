class TimeTakenByX {

static double distance = 550;
static double speed = 15;



static double calculateTimeTakenByX(){

	double time;
	time = distance / speed ;
	System.out.println(time);
	return time;

}

// Considering whatever time we are going to get will be in hr
static void convertTimeToHrMin(double timeInHr){ 
    double timeMin = timeInHr * 60;  //== 150
    double minuteVal = timeMin % 60;   // This will return the value of    // 30
    // double hr = (timeMin / 60.0);
    double actualTimeTaken = timeMin - minuteVal;
    System.out.println("Total time take by X : " + (actualTimeTaken/60) + " hr " + minuteVal + " min");

}

public static void main(String args[]){
	//double time = calculateTimeTakenByX();
	convertTimeToHrMin(calculateTimeTakenByX());
}


}