class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[]=new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        arr[0]=Kelvin;
        arr[1]=Fahrenheit;
        return arr; 
    }
}