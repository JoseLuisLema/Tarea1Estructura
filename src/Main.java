import puce.edu.ec.platos.Platos;

void main() {
  IO.println("SISTEMA DE PLATOS - RESTAURANTE");

  Platos[] listaPlatos = new Platos[30];
  int contador = 0;
  boolean salir = false;

  while (!salir) {
    IO.println("\nMENU PRINCIPAL");
    IO.println("1.Registrar un nuevo plato");
    IO.println("2.Mostrar todos los platos");
    IO.println("3.Salir del programa");

    String opcion = IO.readln("Seleccione una opcion: ");

    if (opcion.equals("1")) {
      if (contador < listaPlatos.length) {
        IO.println("\nREGISTRO DE PLATO");
        int id = contador + 1;

        String nombre = IO.readln("Ingrese el nombre del plato: ");
        while (nombre.trim().isEmpty()) {
          IO.println("Error: El nombre no puede estar vacio.");
          nombre = IO.readln("Ingrese el nombre del plato: ");
        }

        String categoria = "";
        boolean categoriaValida = false;
        while (!categoriaValida) {
          IO.println("Categorias disponibles: Entrada, Plato Fuerte, Postre, Bebida");
          categoria = IO.readln("Ingrese la categoria: ");

          if (categoria.equalsIgnoreCase("Entrada") ||
                  categoria.equalsIgnoreCase("Plato Fuerte") ||
                  categoria.equalsIgnoreCase("Postre") ||
                  categoria.equalsIgnoreCase("Bebida")) {
            categoriaValida = true;
          } else {
            IO.println("Error: Escriba una categoria de la lista.");
          }
        }

        double precio = 0;
        boolean precioValido = false;
        while (!precioValido) {
          String textoPrecio = IO.readln("Ingrese el precio: ");

          if (textoPrecio.trim().isEmpty()) {
            IO.println("Error: Debe ingresar un precio.");
          } else {
            precio = Double.parseDouble(textoPrecio);
            if (precio > 0) {
              precioValido = true;
            } else {
              IO.println("Error: El precio debe ser mayor a 0");
            }
          }
        }

        Platos nuevoPlato = new Platos(id, nombre.trim(), categoria, precio);
        listaPlatos[contador] = nuevoPlato;
        contador++;

        IO.println("Plato registrado exitosamente" + id);
      } else {
        IO.println("Error: La lista de platos esta llena");
      }

    } else if (opcion.equals("2")) {
      IO.println("\nLISTA DE PLATOS REGISTRADOS");

      if (contador == 0) {
        IO.println("Aun no hay platos registrados en el sistema");
      } else {
        for (int i = 0; i < contador; i++) {
          Platos p = listaPlatos[i];
          IO.println("----------------------------------------");
          IO.println("ID: " + p.id());
          IO.println("Nombre: " + p.nombre());
          IO.println("Categoria: " + p.categoria());
          IO.println("Precio: " + p.precio());
        }
        IO.println("----------------------------------------");
        IO.println("Total de platos registrados: " + contador);
      }

    } else if (opcion.equals("3")) {
      IO.println("\nCerrando el sistema");
      salir = true;

    } else {
      IO.println("Opcion no valida");
    }
  }
}