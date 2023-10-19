package hn.uth.pm013p2023.configuracion;

public class Transacciones {
    //Nombre de la Base de datos//

    public static final String namebd ="PM012023";

    //Tablas de la Base de datos//

    public static final String Tabla ="personas";

    //Campos de la tabla//

    public static final String id ="id";
    public static final String nombres ="nombres";
    public static final String apellidos ="apellidos";
    public static final String edad ="edad";
    public static final String correo ="correo";

    //Consulta de Base de Datos//
    public static final String CreateTablePersonas = "CREATE TABLE PERSONAS" +
            "( id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER," +
            "correo TEXT )";

    public static final String DropTablePersonas = "DROP TABLE IF EXISTS personas";

    //dml
    public static final String SelectTablePersonas = "SELECT * FROM" + Transacciones.Tabla;
}
