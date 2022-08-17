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
            System.out.print("Сумма трат за месяц составила"+arr1+"рублей");}
    // Задача 2
        int arr3=0;
        int arr4 = 0;
        for (int i = 0; i < arr.length-1; i++)
         if (arr[i]<arr([i+1])){
            arr4=arr4 + arr[i];} if(arr[i] > arr([i+1]) {arr3= arr3+arr[i];}{
            System.out.println("Минимальная сумма трат за день составила"+ arr4+ "рублей. Максимальная сумма трат за день составила" +arr3+ "рублей");
        }

    // Задача 3
        int arr2 = 0;
        for (var i =0; i<arr.length; i ++) {
            arr2=arr2+arr[i];}{
            System.out.print("Средняя сумма трат за месяц составила"+ arr1/30 + "рублей");}
    // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i<reverseFullName.length;i--){
            System.out.print(reverseFullName[i]);}

    }


}