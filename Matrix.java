import java.util.Scanner;
class GetMatrix{
    int A[][]=new int[2][2];
    int B[][]=new int[2][2];

    void GetEle(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter ele of matrix A: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter ele of matrix B: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                B[i][j]=sc.nextInt();
            }
        }

        
    }

    void printMatrix(){
        System.out.println("matrix A: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("matrix B: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }

    void add(){
        int C[][]=new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        System.out.println("addition matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }

    void sub(){
        int C[][]=new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                C[i][j]=A[i][j]-B[i][j];
            }
        }

        System.out.println("substraction matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }

    void multi(){
        int C[][]=new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2 ;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        System.out.println("multiplication matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Matrix{
    public static void main(String args[]){
        GetMatrix M=new GetMatrix();
        M.GetEle();
        M.printMatrix();
        M.add();
        M.sub();
        M.multi();

    }
}