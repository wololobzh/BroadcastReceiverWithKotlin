package fr.acos.broadcastreceiverwithkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.IntentFilter
import fr.acos.broadcastreceiverwithkotlin.broadcastreceivers.MyReceiver


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Objet représentant un intent filter sur l'évènement "fr.acos.event"
        val intentFilter = IntentFilter("fr.acos.event")
        //Instance du Broascast Receiver à qui on veut ajouter un évènement.
        val mReceiver = MyReceiver()

        //Abonnement du Broadcast Receiver à l'évènement "fr.acos.event"
        this.registerReceiver(mReceiver, intentFilter)
    }

    override fun onResume() {
        super.onResume()

        //Objet représentant un évènement sous forme d'Intent
        val intent = Intent("fr.acos.event")
        //Diffusion de l'évènement
        sendBroadcast(intent)
    }
}
