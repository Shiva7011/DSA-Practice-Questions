
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int num = 5;
        StringBuilder sb = new StringBuilder();

        // Append bits
        while(num != 0){
            if(num % 2 == 1) sb.append('1');
            else sb.append('0');
            num = num / 2;
        }

        // Reverse string builder
        sb.reverse();

        System.out.print(sb.toString());
    }
}
