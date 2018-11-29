import PropTypes from 'prop-types';
import { requireNativeComponent } from 'react-native';

var viewProps = {
    name: 'LineGraph',
    propTypes: {
        data: PropTypes.array,
        title: PropTypes.string
    }
}

module.exports = requireNativeComponent('LineGraph', viewProps);

