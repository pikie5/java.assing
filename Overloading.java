class Add {
    int add( int a, int b){
        return a +b ;
    }    


    double add(double a, double b, double c){
        return  a +b +c;
    }    


    float add (float a, int b){
        return  a +b;
    }
    class Overload{
        
        public static void main (String [] args){
            Add overloading = new Add();
            System.out.println(overloading.add(10,20));
            System.out.println(overloading.add(10.342,20.65, 34.54));
            System.out.println(overloading.add(10.34F,20));
        }
    }
}