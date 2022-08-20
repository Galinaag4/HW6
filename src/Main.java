public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){
    int[] arr = generateRandomArray();
    for (int i =0; i<arr.length; i ++){
        System.out.println(arr[i]);}
    // Задача 1
        int arr1 = 0;
    for (int i =0; i<arr.length; i ++) {
        arr1=arr1+arr[i];}{
        System.out.println("Сумма трат за месяц составила "+arr1+" рублей");}
    // Задача 2
        int min=arr[0];
        int max= arr[0];
        for (int i = 0; i < arr.length; i++){
        if (max<arr[i]){max = arr[i];}
        if (min>arr[i]){min = arr[i];}}{
            System.out.println("Минимальная сумма трат за день составила "+min+" Максимальная сумма трат составила "+min);}
        // Задача 3
        int arr2 = 0;
        int daysInMonth = 30;
        for (var i =0; i<arr.length; i ++) {
       arr2=arr2+arr[i];}{
       System.out.println("Средняя сумма трат за месяц составила "+arr2/daysInMonth+" рублей");}
    // Задача 4.
       char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i >=0; i--) {
       System.out.print(reverseFullName[i]);}

    ;}
    }

