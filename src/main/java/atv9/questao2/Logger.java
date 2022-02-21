package atv9.questao2;

import java.util.Objects;

public class Logger {

  private boolean ativo = false;
  private static Logger logger = new Logger();

  public static Logger getInstance() {
    if(Objects.isNull(logger)){
      return  new Logger();
    }
    return logger;
  }

  private Logger() {
  }

  public boolean isAtivo() {
    return this.ativo;

  }

  public void setAtivo(boolean b) {
    this.ativo = b;
  }

  public void log(String s) {
    if (this.ativo) {
      System.out.println("LOG :: " + s);
    }

  }
}
