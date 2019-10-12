package methods_parameter;

/**
*@author - explorechoice.org
*/

class CalculateActualAmountToPayWith3Methods {
double productCost = 1500;
int duration;
double actualAmountToPay;
double interestAmount;

void costAfterThreeMonths(){
        interestAmount = 1500 * (10.0/100);
        actualAmountToPay = productCost + interestAmount;
        System.out.println(actualAmountToPay);

}

void costAfterSixMonths(){
        interestAmount = 1500 * (12.0/100);
        actualAmountToPay = productCost + interestAmount;
        System.out.println(actualAmountToPay);

}
void costAfterTwelveMonths(){
        interestAmount = 1500 * (15.0/100);
        actualAmountToPay = productCost + interestAmount;
        System.out.println(actualAmountToPay);

}



}
