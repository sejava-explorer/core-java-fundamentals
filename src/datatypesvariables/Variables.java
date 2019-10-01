// Variables are just like container or placeholder that helps to store data/value which can be used in our program further.

// In technical term- Variables are nothing but ons of the memory location within our system internal memory which helps to store data at runtime on which the operation can be performed by methods

package datatypesvariables;

class Variables {
// Variable Declaration == datatype + variable name + ;
int i;
// Variable Definition = Variable Declaration + Variable initialization
double d = 5674.89;

public void initVariable(){
        i = 345; // variable initialization = varibale name + '=' + value
        System.out.println(i);
        System.out.println(d);
}

public static void main(String args[]){

  Variables v = new Variables();
  v.initVariable();

}
}
