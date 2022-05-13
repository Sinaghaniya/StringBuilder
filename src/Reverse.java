public class Reverse {
    public static void main(String[]args){

        StringBuilder name = new StringBuilder("RajaBabu");

        for(int i=0;i<name.length()/2;i++){

            int first = i;

            int last = name.length()-1-i;

            char firstchar = name.charAt(first);
            char lastchar = name.charAt(last);

            name.setCharAt(last,firstchar);
            name.setCharAt(first,lastchar);

        }

        System.out.println("First MEthod:");

        System.out.println(name);

        //second method

        System.out.println("Second Method:");

        String namex = "jaxa";

        char[] arr = namex.toCharArray();

        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]);

        }

        System.out.println();

        //thirdMethod

        StringBuilder nama = new StringBuilder("JOBS");

        nama.reverse();

        System.out.println("Third Method:");

        System.out.println(nama);


    }
}
