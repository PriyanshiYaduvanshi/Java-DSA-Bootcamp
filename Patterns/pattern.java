package Patterns;

public class Main {
    static void main(String[] args) {
        SolidSquare(4);
        LeftHalfPyramid(4);
        InvertedHalfPyramid(4);
        NumberHalfPyramid(4);
        StarDiamond(4);
        RightAlignedHalfPyramid(4);
        InvertedRightAngledHalfPyramid(4);
        FullPyramid(5);
        InvertedFullPyramid(5);
        SpacedFullPyramid(5);
        InvertedSpacedFullPyramid(5);
        Clock(4);
    }

    static void SolidSquare(int n){
        System.out.println("Solid Square Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void LeftHalfPyramid(int n){
        System.out.print ("Left Half Pyramid Pattern");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void InvertedHalfPyramid (int n){
        System.out.println("Inverted Left Half Pyramid Pattern");
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void NumberHalfPyramid(int n){
        System.out.println("Number Half Pyramid Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void StarDiamond(int n){
        System.out.println("Star Diamond Pattern");
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void RightAlignedHalfPyramid(int n){
        System.out.println("RightAlignedHalfPyramid");
        for(int i=1;i<=n;i++){
            for(int s=n; s>i;s--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void InvertedRightAngledHalfPyramid(int n){
        System.out.println("Inverted Right Angled Half Pyramid Pattern");
        for(int i=1;i<=n;i++){
            for(int s=1;s<i;s++){
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void FullPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void InvertedFullPyramid(int n){
        for(int i=0;i<=n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void SpacedFullPyramid(int n){
        System.out.println("Spaced Full Pyramid");
        for(int i=0;i<=n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void InvertedSpacedFullPyramid(int n){
        System.out.println("Inverted Spaced Full Pyramid");
        for(int i=0;i<=n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
      System.out.println();
    }

    static void Clock(int n){
        System.out.println("Sand Clock Pattern");
        for(int i=1;i<=n;i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
