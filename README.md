# 🪨 NoOreGen

**Plugin para servidores Minecraft 1.21.x (Purpur, Spigot, Paper, etc.)** que **impede totalmente a geração de minérios** em novos chunks.

## 🔧 Funcionalidade
- Remove todos os minérios gerados automaticamente em novos chunks.
- Substitui os minérios por `stone` ou blocos equivalentes.
- Garante que mesmo se algum minério escapar na geração, ele será removido ao carregar o chunk.

## ✅ Compatibilidade
- Compatível com **todas as versões 1.21.x** (1.21.0 até 1.21.6).
- Requer **Java 21** e qualquer servidor baseado em Bukkit/Spigot/Paper/Purpur.
- Desenvolvido e testado em **Purpur 1.21.6**.

## 🧱 Minérios bloqueados
Inclui:
- Carvão (`COAL_ORE`, `DEEPSLATE_COAL_ORE`)
- Ferro
- Cobre
- Ouro
- Redstone
- Lápis-lazúli
- Diamante
- Esmeralda

## 📦 Instalação
1. Baixe o plugin [`noore-1.1.jar`](https://github.com/Morpheus-nox/noore/releases).
2. Coloque o `.jar` em `plugins/`.
3. Reinicie ou inicie seu servidor.

## 🛑 Limitações
- Chunk antigos **não são afetados**.
- Não remove minérios de **loot de baús** ou **estruturas geradas** (intencional).
- Novos minérios adicionados futuramente precisarão ser adicionados manualmente.

## 👤 Autor
- Morpheus Nox - [github.com/Morpheus-nox](https://github.com/Morpheus-nox)

## 📜 Licença
Distribuído sob a [MIT License](LICENSE).
