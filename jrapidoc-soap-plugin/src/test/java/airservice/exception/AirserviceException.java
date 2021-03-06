package airservice.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyException", propOrder = {
        "message"
})
public class AirserviceException {

    protected String message;

    public String getMessage() {
        return message;
    }

    public AirserviceException setMessage(String value) {
        this.message = value;
        return this;
    }
}
