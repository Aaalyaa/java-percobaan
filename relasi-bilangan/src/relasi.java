public class relasi {
        public static void main(String[] args) {
        int i=37;
        int j=42;
        int k=42;
        System.out.println("Nilai Variable:"); 
        System.out.println("i=+i"); 
        System.out.println("j-+j"); 
        System.out.println("k-+k");

        System.out.println("Lebih besar dari:"); 
        System.out.println("i>j-"+(i>j)); 
        System.out.println("j>i="+(j>i)); 
        System.out.println("k>j="+(k>j));

        System.out.println("Lebih kecil dari:");
        System.out.println("i<j="+(i<j));
        System.out.println("j<i="+(j<i));
        System.out.println("k<j-"+(k<j));

        System.out.println("Lebih besar sama dengan:");
        System.out.println("i>-j-"+(i>-j));
        System.out.println("j>=i="+(j>=i)); 
        System.out.println("k>=j="+(k>=j));

        System.out.println("Lebih kecil sama dengan:");
        System.out.println("i<=j="+(i<=j));
        System.out.println("j<-i-"+(j<-1));
        System.out.println("k<=j-"+(k<=j));

        System.out.println("Sama dengan:");
        System.out.println("i--j"+(i==j));
        System.out.println("j==i"+(j==i));
        System.out.println("k=-j"+(k==j));
        }
}
