public class LinearSearch2 {

    // linear search 
    public static int linearSearch(String menu[], String food) {

        for(int i=0; i<menu.length; i++) {
            if(menu[i] == food) {
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"samosa", "papdi", "chutney", "chicken", "rice"};
        String food = "rice";
        
        int result = linearSearch(menu, food);

        if(result == -1) {
            System.out.println("Food isn't found");
        }
        else {
            System.out.println("Food is present at index: " + result);
        }
    }
}
