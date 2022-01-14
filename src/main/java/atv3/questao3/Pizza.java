package atv3.questao3;

import com.sun.source.tree.UsesTree;

public abstract class Pizza {

  protected String descricao;

  protected abstract void setDescricao(String descricao);
  protected abstract String getDescricao();
  protected abstract Double custo();



}
