rule "Check Contacts"
when
    Member of Group contacts changed
then
    var Number count = 0
    
    if (Fenster_1.state.toString == "OPEN") {
      Alexa_TTS.sendCommand("Fenster 1")
      count = count + 1
    }
    if (Fenster_2.state.toString == "OPEN") {
      Alexa_TTS.sendCommand("Fenster 2")
      count = count + 1
    }
    if (Fenster_3.state.toString == "OPEN") {
      Alexa_TTS.sendCommand("Fenster 3")
      count = count + 1
    }
    if (Tuer_1.state.toString == "OPEN") {
      Alexa_TTS.sendCommand("Tür 1")
      count = count + 1
    }
    if (Tuer_2.state.toString == "OPEN") {
      Alexa_TTS.sendCommand("Tür 2")
      count = count + 1
    }
    if (count == 1) {
      Alexa_TTS.sendCommand("ist noch offen")
      CheckContactOutput.sendCommand("Nicht alles geschlossen")
    }
    else if (count > 1) {
      Alexa_TTS.sendCommand("sind noch offen")
      CheckContactOutput.sendCommand("Nicht alles geschlossen")
    }
    else {
      Alexa_TTS.sendCommand("Alles ist geschlossen")
      CheckContactOutput.sendCommand("Alles geschlossen")
    }

    CheckContact.sendCommand(OFF)
end