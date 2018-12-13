package geneTranscription

import entity.EnumStatic
import entity.MessageGlobal

public class HomeController extends BaseController {

    def index() {
        //check available

        def message = new MessageGlobal("Hello", EnumStatic.BootstrapAlertTypes.success)
        [message: message]
    }



}

