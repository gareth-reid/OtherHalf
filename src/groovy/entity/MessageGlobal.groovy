package entity

/**
 * Created by reid gareth on 30/01/2015.
 */
public class MessageGlobal {
    public MessageGlobal(String text, EnumStatic.BootstrapAlertTypes type, Boolean error = true)
    {
        Text = text
        Type = type
        Error = error
    }

    public MessageGlobal()
    {
        Text = ""
        Type = EnumStatic.BootstrapAlertTypes.none
        Error = false
    }
    public String Text
    public Boolean Error
    public EnumStatic.BootstrapAlertTypes Type
}
