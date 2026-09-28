public class ElectronicsReport {
    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        int[][] sales = {
            {1000, 2000, 3000}, //Cape Town
            {2000, 3000, 4000}, //Port Elizabeth
            {1500, 1100, 1200}  //Pretoria
        };
        
        System.out.println("GAMING CONSOLE REPORT");
        System.out.printf("%-15s %8s %8s %8s%n", "", "PS5", "XBOX", "SWITCH");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s", cities[i].toUpperCase());
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%8d", sales[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        
        int maxSales = -1;
        String topCity = "";
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }
            
            System.out.printf("%-15s R%d%n", cities[i].toUpperCase(), cityTotal);
            
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }
        
        System.out.println("CITY WITH THE MOST SALES: " + topCity.toUpperCase());
    }
}