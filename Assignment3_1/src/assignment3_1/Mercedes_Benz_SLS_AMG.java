package assignment3_1;

//prankuragarwal
public class Mercedes_Benz_SLS_AMG extends Merecedes{
    public double average(int size, int[] a) {
       int i;
       double avg;
       int sum = 0;
       for (i = 0; i < size; i++){
           sum += a[i];
       }
       avg = (1.0 * sum) / (1.0 * size);
       return avg; 
    }

    public int maxSpeed(int size, int[] a) {
        int max = 0;
        int i;
        for (i = 0; i < size; i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public double Rpm(int size, int[] a, int radius) {
       int i;
       double avg, rpm;
       int sum = 0;
       for (i = 0; i < size; i++){
           sum += a[i];
       }
       avg = (1.0 * sum) / (1.0 * size);
       avg = avg * (5.0/18.0);
       rpm = avg * 60.0;
       rpm /= 2;
       rpm /= radius;
       rpm /= Math.PI;
       return rpm;
    }
}
