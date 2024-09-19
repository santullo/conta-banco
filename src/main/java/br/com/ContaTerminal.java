package br.com;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaTerminal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public String printNomeAgencia() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",
                this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
}
