package geneTranscription

import configuration.Configuration
import entity.MessageGlobal
import grails.util.Environment

class BaseController {

    public MessageGlobal message = new MessageGlobal()

    protected String _infoSign = "<span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>"

    public BaseController() {
        Init()
    }

    public void Init()
    {

    }
}
