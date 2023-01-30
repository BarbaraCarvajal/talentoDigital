package Trabajos;

import java.util.Scanner;

public class Version2 {
  private static final int ROWS = 3;
  private static final int COLUMNS = 10;
  private static String[][] matrix = new String[ROWS][COLUMNS];

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int currentRow = 0;

    while (currentRow < ROWS) {
      System.out.println("Seleccione un perfil de usuario:");
      System.out.println("1. Cliente");
      System.out.println("2. Profesional");
      System.out.println("3. Administrativo");
      String userProfile = input.nextLine();

      // Registrar nombre, fecha de nacimiento y RUN (campos obligatorios)
      System.out.print("Ingrese nombre: ");
      matrix[currentRow][0] = input.nextLine();
      System.out.print("Ingrese fecha de nacimiento: ");
      matrix[currentRow][1] = input.nextLine();
      System.out.print("Ingrese RUN: ");
      matrix[currentRow][2] = input.nextLine();

      switch (userProfile) {
        case "1": // Cliente
          System.out.print("Ingrese dirección: ");
          matrix[currentRow][3] = input.nextLine();
          System.out.print("Ingrese teléfono: ");
          matrix[currentRow][4] = input.nextLine();
          break;
        case "2": // Profesional
          System.out.print("Ingrese años de experiencia: ");
          matrix[currentRow][5] = input.nextLine();
          System.out.print("Ingrese departamento: ");
          matrix[currentRow][6] = input.nextLine();
          break;
        case "3": // Administrativo
          System.out.print("Ingrese función: ");
          matrix[currentRow][7] = input.nextLine();
          System.out.print("Ingrese nombre del superior: ");
          matrix[currentRow][8] = input.nextLine();
          break;
        default:
          System.out.println("Perfil de usuario inválido.");
          continue;
      }
      currentRow++;
    }
    System.out.println("Registro de usuarios completado.");
    input.close();
  }
}
