# AREP-PARCIAL2

> OperacionExpLocal

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationExp.png)

> OperacionLogLocal

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationLog.png)

>OperacionExpAWS

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationLog-AWS.png)


>imagenes docker en el repositorio

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/dockerhub.png)

##Despliegue en ASW

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
  
> OperacionLogAWS

![](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/operationExp-AWS.png)

> descargue el video el el siguiente link 

- [video](https://github.com/PaulaSanchez810/AREP-PARCIAL2/blob/main/img/Parcial2arep.mkv) 

