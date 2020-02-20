def daint = [name: 'daint',
             archs: ['gpu', 'mc'],
             buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
             unusePath: '/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/tools/modules/all:/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/modules/all',
             modulesProduction: '/apps/common/UES/jenkins/production/login',
             prefixProduction: '$APPS/UES/jenkins/7.0.UP01/ARCH/easybuild']

def dom = [name: 'dom',
           archs: ['gpu', 'mc'],
           buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
           unusePath: '/apps/dom/UES/jenkins/7.0.UP01/ARCH/easybuild/tools/modules/all:/apps/dom/UES/jenkins/7.0.UP01/ARCH/easybuild/modules/all',
           modulesProduction: '/apps/common/UES/jenkins/production/login',
           prefixProduction: '$APPS/UES/jenkins/7.0.UP01/ARCH/easybuild']

def fulen = [name: 'fulen',
             archs: [],
             buildPath: '/dev/shm/$USER/easybuild/build',
             unusePath: '/apps/fulen/UES/modulefiles',
             modulesProduction: '',
             modulesUnuseProduction: '',
             prefixProduction: '/apps/fulen/UES/jenkins/RH7.4/easybuild']

def kesch = [name: 'kesch',
             archs: [],
             buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
             unusePath: '/apps/escha/UES/easybuild/modulefiles',
             modulesProduction: '',
             prefixProduction: '/apps/escha/UES/jenkins/RH7.5/generic/easybuild']

return [daint, dom, kesch]
