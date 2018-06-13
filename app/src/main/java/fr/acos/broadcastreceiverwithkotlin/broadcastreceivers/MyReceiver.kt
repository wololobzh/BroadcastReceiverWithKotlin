package fr.acos.broadcastreceiverwithkotlin.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

/**
 * Classe représentant le BroadCastReceiver
 */
class MyReceiver : BroadcastReceiver(), AnkoLogger
{
    /**
     * Fonction executée lors de la reception d'un évènement.
     * @param context Contexte de l'application.
     * @param Intent représentant l'évènement receptionné.
     */
    override fun onReceive(context: Context, intent: Intent)
    {
        info("Réception de l'évènement ${intent.action}")
    }
}
