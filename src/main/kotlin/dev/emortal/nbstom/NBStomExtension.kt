package dev.emortal.nbstom

import net.minestom.server.extensions.Extension

class NBStomExtension : Extension() {
    override fun initialize(): LoadStatus =
        LoadStatus.SUCCESS

    override fun terminate() {
    }
}