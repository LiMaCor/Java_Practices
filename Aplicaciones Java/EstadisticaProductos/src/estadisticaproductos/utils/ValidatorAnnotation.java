package estadisticaproductos.utils;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Luis
 */
public class ValidatorAnnotation<T> {

    public String getListErrors(T t) {
        StringBuilder sb = new StringBuilder();
        //Crea los objetos para validaciones
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        // Creamos un conjunto (set) de errores
        Set<ConstraintViolation<T>> violations;
        // Establecemos el objeto de validacion
        violations = validator.validate(t);
        // Obtenemos los mensajes de error de validacion 
        for (ConstraintViolation<T> violation : violations) {
            sb.append(violation.getMessage()).append("\n");
        }

        return sb.toString();
    }
}
