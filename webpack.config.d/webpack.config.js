var nodeExternals = require('webpack-node-externals');
config.target = 'node';
config.mode = 'production';
config.externalsPresets = {node: true}
config.externals = [nodeExternals({modulesDir:__dirname + '\\..\\..\\node_modules'})];

//kotlinモジュールを出力JavaScriptに組み込む場合はこうする
//config.externals = [nodeExternals({modulesDir:__dirname + '\\..\\..\\node_modules', allowlist:['kotlin']})];

//minifyを無効にする場合はこうする
//config.optimization = {minimize: false}

//SourceMapを生成しないようにするにはこうする
//config.devtool = false;