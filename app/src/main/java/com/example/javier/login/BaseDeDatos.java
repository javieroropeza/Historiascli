package com.example.javier.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Javier on 22/10/2015.
 */
public class BaseDeDatos extends SQLiteOpenHelper {


        String fichaIden = "CREATE TABLE FichaIdentificacion ( Id INTEGER DEFAULT '''CURRENT_TIME''' PRIMARY KEY AUTOINCREMENT NOT NULL, [Apellido_Paterno] TEXT  NULL, " +
                "[Apellido_Materno] TEXT  NULL, [Nombre] TEXT  NULL, [Fecha_Nacimiento] TEXT  NULL, [Edad] NUMERIC  NULL, [Genero] TEXT  NULL, [Estado_Civil] TEXT  NULL, " +
                "[Ocupacion] TEXT  NULL, [Lugar_de_Origen] TEXT  NULL, [Lugar_de_Residencia] TEXT  NULL, [Domicilio] TEXT  NULL, [Telefono] NUMERIC  NULL, [Nombre_Responsable] TEXT  NULL, " +
                "[Domicilio_Responsable] TEXT  NULL, [Telefono_Responsable] NUMERIC  NULL, [Religion] TEXT  NULL, [Fecha_Ingreso] DATE  NULL, " +
                "[Fecha_Elaboracion] DATE  NULL, [Piso_o_Sala] TEXT  NULL, [Cama] TEXT  NULL )";

    String gineco = "CREATETABLE[Gineco_Obstetricos](\n" +
                "[Menarca] BOOLEAN  NULL,\n"+
                "[Desarrollo_Sexual] TEXT  NULL,\n"+
                "[Ritmo_Menstrual] TEXT  NULL,\n"+
                "[Cantidad] INTEGER  NULL,\n"+
                "[Duracion] TEXT  NULL,\n"+
                "[Fecha_Ultima_Menstruacion] DATE  NULL,\n"+
                "[Fecha_Probable_Parto] DATE  NULL,\n"+
                "[Fecha_Ultima_Parto] DATE  NULL,\n"+
                "[Fecha_Primera_Relacion] DATE  NULL,\n"+
                "[Fecha_Matrimonio] DATE  NULL,\n"+
                "[Fecha_Menopausia] DATE  NULL,\n"+
                "[Fecha_Climaterio] DATE  NULL,\n"+
                "[Vida_Sexual] TEXT  NULL,\n"+
                "[Numero_Gestas] NUMERIC  NULL,\n"+
                "[Partos] BOOLEAN  NULL,\n"+
                "[Abortos] BOOLEAN  NULL,\n"+
                "[Cesareas] BOOLEAN  NULL,\n"+
                "[Metodo_Anticonceptivo] TEXT  NULL,\n"+
                "[Fecha_Ultimo_Papanicolau] DATE  NULL,\n"+
                "[Id_Gineco] INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL,\n"+
                "[DesMenarca] TEXT  NULL\n"+
                ")";

    String Heredo = "CREATE TABLE [Heredo_Familiares] (\n" +
            "[Tuberculosis] BOOLEAN  NULL,\n" +
            "[Diabetes_Melitus] BOOLEAN  NULL,\n" +
            "[Hipertension] BOOLEAN  NULL,\n" +
            "[Neoplasias] BOOLEAN  NULL,\n" +
            "[Cardiopatias] BOOLEAN  NULL,\n" +
            "[Hepatopatias] BOOLEAN  NULL,\n" +
            "[Nefropatias] BOOLEAN  NULL,\n" +
            "[Obesidad] BOOLEAN  NULL,\n" +
            "[Hipertiroidismo] BOOLEAN  NULL,\n" +
            "[Hipotiroidismo] BOOLEAN  NULL,\n" +
            "[Enfermedades_Mentales] BOOLEAN  NULL,\n" +
            "[Epilepsia] BOOLEAN  NULL,\n" +
            "[Asma] BOOLEAN  NULL,\n" +
            "[Anemia] BOOLEAN  NULL,\n" +
            "[Sifilis] BOOLEAN  NULL,\n" +
            "[Alteraciones_Geneticas] BOOLEAN  NULL,\n" +
            "[Id_Heredo_Familiares] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT\n" +
            ")";

        String pernopatologicos = "CREATE TABLE [Personales_No_Patologicos] (\n" +
                "[Higiene] BOOLEAN  NULL,\n" +
                "[Agua] BOOLEAN  NULL,\n" +
                "[Defecacion] BOOLEAN  NULL,\n" +
                "[Lavado_Dientes] BOOLEAN  NULL,\n" +
                "[Alimentacion] BOOLEAN  NULL,\n" +
                "[Escolaridad] TEXT  NULL,\n" +
                "[Inmunizaciones] BOOLEAN  NULL,\n" +
                "[Hipersensibilidad_Alergia_Farmacos] BOOLEAN  NULL,\n" +
                "[Hemotipo_Rh] BOOLEAN  NULL,\n" +
                "[Id_Peronales_No_Patologicos] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT\n" +
                ")";

        String perpatologicos = "CREATE TABLE [Personales_Patologicos] (\n" +
                "[Tabaquismo] BOOLEAN  NULL,\n" +
                "[Alcoholismo] BOOLEAN  NULL,\n" +
                "[Toxicomanias] BOOLEAN  NULL,\n" +
                "[Enfermades_Infecciosas_Infancia] BOOLEAN  NULL,\n" +
                "[Tuberculosis] BOOLEAN  NULL,\n" +
                "[Enfermedades_Venereas] BOOLEAN  NULL,\n" +
                "[Fiebre_Tifoidea] BOOLEAN  NULL,\n" +
                "[Salmonelosis] BOOLEAN  NULL,\n" +
                "[Neumonias] BOOLEAN  NULL,\n" +
                "[Paludismo] BOOLEAN  NULL,\n" +
                "[Parasitosis] BOOLEAN  NULL,\n" +
                "[Padecimientos_Articulares] BOOLEAN  NULL,\n" +
                "[Intervenciones_Quirurgicas] BOOLEAN  NULL,\n" +
                "[Fracturas_Esguinces] BOOLEAN  NULL,\n" +
                "[Perdida_Conocimiento] BOOLEAN  NULL,\n" +
                "[Intolerancia_Medicamentos] BOOLEAN  NULL,\n" +
                "[Desarrollo_Somatico] BOOLEAN  NULL,\n" +
                "[Alergias] BOOLEAN  NULL,\n" +
                "[Id_Personales_Patologicos] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT\n" +
                ")";

    public BaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
