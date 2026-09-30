PRIMEIRO ROTEIRO DA DISCIPLINA DE LEDA

Este é o meu primeiro (de muitos) repositório em que utilizo o GitHub, estou aprendendo
os comandos ainda mas estou gostando bastante.

COMANDOS ESSENCIAIS:
- git init :
(Transforma a pasta atual em um repositório Git, criando a pasta oculta .git que guarda todo o histórico de versões do projeto. É o primeiro passo quando você quer começar a versionar um projeto do zero.)
- git add . :
(Coloca todos os arquivos modificados/novos da pasta em "staging" (área de preparação), avisando ao Git quais mudanças você quer incluir no próximo commit. O . significa "todos os arquivos da pasta atual")
- git clone "(URL do seu repositório)" :
(Faz uma cópia completa de um repositório remoto para sua máquina, incluindo todo o histórico e já configurando o remote origin automaticamente. Usado quando você ainda não tem o projeto localmente.)
- git commit -m "(Mensagem de commit dos arquivos)" : (Salva as mudanças que estão no staging como um novo "ponto" no histórico do projeto, junto com uma mensagem descrevendo o que foi feito. É como tirar uma foto do estado atual do projeto.)
- git remote add origin "url" : (Conecta seu repositório local a um repositório remoto (no GitHub, por exemplo), dando a ele o apelido origin. Isso permite enviar (push) e receber (pull) mudanças desse repositório remoto.)
- git branch -m main : (Renomeia a branch atual para main. O -M força a renomeação mesmo que já exista uma branch com outro nome (como master, que era o padrão antigo do Git).)
- git push -u origin main : (Envia os commits da sua branch local main para o repositório remoto origin. O -u (upstream) faz o Git "lembrar" essa ligação, então da próxima vez você só precisa digitar git push sem especificar origin/main de novo.)
- git pull : (Busca as atualizações mais recentes do repositório remoto e já mescla (merge) elas na sua branch local. É o comando usado para manter seu projeto local sincronizado com o que está no GitHub.)



