
package edu.ulima.ws;

import edu.ulima.bean.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "AlumnoService")
public class AlumnoService {

    List<Alumno> lista=new ArrayList<>();
    public AlumnoService() {
        lista.add(new Alumno(2001, "N1", "A1"));
        lista.add(new Alumno(2002, "N2", "A2"));
        lista.add(new Alumno(2003, "N3", "A2"));
        lista.add(new Alumno(2004, "N1", "A3"));
        lista.add(new Alumno(2005, "N4", "A4"));
        lista.add(new Alumno(2006, "N4", "A5"));
        lista.add(new Alumno(2007, "N5", "A5"));
        
    }

    @WebMethod(operationName = "findCodigo")
    public Alumno findCodigo(@WebParam(name = "codigo") int codigo) {
        Alumno a=null;
        
        for (Alumno element : lista){
            if(element.getCodigo()==codigo){
                a=new Alumno(codigo, element.getNombre(), element.getApellido());
                break;
            }
        }
        
        return a;
    }

    @WebMethod(operationName = "findApellido")
    public List findApellido(@WebParam(name = "apellido") String apellido) {
        List<Alumno> l = new ArrayList<>();
        for (Alumno element : lista){
            if(element.getApellido().equalsIgnoreCase(apellido)){
                l.add(element);
            }
        }
        return l;
    }
}
