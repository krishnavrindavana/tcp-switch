package com.score.senzswitch.components

import com.score.senzswitch.protocols.KeyType.KeyType
import com.score.senzswitch.protocols.{SenzKey, SwitchKey}

/**
 * Created by eranga on 7/15/16.
 */
trait CertificateStoreComp {

  val certificateStore: CertificateStore

  trait CertificateStore {
    def getSwitchKey(keyType: KeyType): Option[SwitchKey]

    def saveSenzKey(senzKey: SenzKey)

    def findSenzKey(name: String): Option[SenzKey]
  }

}
