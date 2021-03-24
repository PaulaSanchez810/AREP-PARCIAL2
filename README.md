# AREP-PARCIAL2


>OperacionExpAWS

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationLog-AWS.png)

> OperacionLogAWS

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationExp-AWS.png)

>imagenes docker en el repositorio

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/dockerhub.png)

## Despliegue en ASW

#### inicio de maquina ASW por SSH en Windows
Para porder usar SSH en Windows, para ingresar a la maquina de ASW, debe utilizar PowerShell y ejecutar los siguinetes comandos:
> $path = ".\<llave privada de la maquina en Asw>"
##### Restablecer para eliminar permisos explícitos
> icacls.exe $path /reset
##### Dar permiso de lectura explícito al usuario actual
> icacls.exe $path /GRANT:R "$($env:USERNAME):(R)"
##### Deshabilite la herencia y elimine los permisos heredados
> icacls.exe $path /inheritance:r

### conectando a la instancia AWS

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/img-SSHec2.png)

### instanciando contenedor docker a AWS
  
![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/ec2-docker.png)

> mire el video - [Aqui](https://web.microsoftstream.com/video/60c128c3-d6f7-46ad-97c4-4ef784aa16de) 

