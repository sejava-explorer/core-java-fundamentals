package methods_parameter;

/**
*@author - explorechoice.org
*/


class CalculateActualAmountToPay {
double productCost = 1500;
int duration;
double actualAmountToPay;
double interestAmount;

void costAfterXMonths(double roi){
        interestAmount = 1500 * (roi/100);
        actualAmountToPay = productCost + interestAmount;
        System.out.println(actualAmountToPay);

}

}
