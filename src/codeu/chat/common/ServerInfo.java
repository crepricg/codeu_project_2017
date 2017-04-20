package codeu.chat.common;

import codeu.chat.util.Uuid;

public final class ServerInfo {
  public final Uuid version;

  public ServerInfo() {
    this.version = Uuid.fromString("1.0.0");
  }

  public ServerInfo(Uuid version) {
    this.version = version;
  }
}
